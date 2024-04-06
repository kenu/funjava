import ssl
ssl._create_default_https_context = ssl._create_unverified_context
from urllib import request
import json

with request.urlopen("https://fun.okdevtv.com/api/words") as f:
	doc = json.loads(f
		.read(16384) # 16KiB
		.decode("utf-8"))
	print(doc["content"])

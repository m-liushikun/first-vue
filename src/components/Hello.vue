<template>
  <div class="hello">
<div class="img1" style="width:0px"></div>
	<div style="width:100%;height:100%;background-color:rgb(255, 255, 255);overflow: hidden;text-align:center;">
		<img class="img" src="${pageContext.request.contextPath }/static/images/b-1g.png" style="margin-top:150px;" alt=""><br>
		<img class="img" src="${pageContext.request.contextPath }/static/images/b-g5.png" style="position:absolute;top:220px;margin-left:-130px" alt="">
		<p style="position:absolute;top:260px;text-align:center;color:white;font-size:2em;width:100%;margin-top:35px;"><span>迪锐克斯 DXRacer 分销管理系统</span></p>
		<div id="M-p" style="width:1920px;height:250px;position:absolute;left:50%;margin-left:-960px;background-size:100% 100%;background-image:url(${pageContext.request.contextPath }/static/images/bg2.png);top:380px;">
			<div style="width:700px;margin:0px auto;position:relative;left:-55px;">
				<img src="${pageContext.request.contextPath }/static/images/b-g4.png" style="display:block;margin:91px 0px" alt="">
				<div style="width:450px;height:265px;display:inline-block;position:relative;top:-250px;background-image:url(${pageContext.request.contextPath }/static/images/28.png);left:130px;background-size:100% 100%;">
					<form style="margin:35px auto;width:100%" method="post" action="${pageContext.request.contextPath }/user/login">
						<div><span style='width:36px;height:36px;display:inline-block;background-color: red;line-height:36px'><img src="${pageContext.request.contextPath }/static/images/b-pc.png" style="line-height:36px;vertical-align: middle;" value=""></span>
							<input style="width:320px;height:36px;padding-left:10px;" name="business_id" placeholder="企业编号" value=""></div>

						<div style='margin-top:5px;'><span style='width:36px;height:36px;display:inline-block;background-color: red;line-height:36px'><img src="${pageContext.request.contextPath }/static/images/b-g2.png" style="line-height:36px;vertical-align: middle;" value=""></span>
							<input style="width:320px;height:36px;padding-left:10px;" name="username" placeholder="用户名" value=""></div>
						<div style="margin-top:5px">
							<span style='width:36px;height:36px;display:inline-block;background-color: red;line-height:36px'><img src="${pageContext.request.contextPath }/static/images/b-g3.png" style="line-height:36px;vertical-align: middle;" value=""></span>
							<input type="password" placeholder="密码" style="width:320px;height:36px;padding-left:10px;" name="password" value="">
						</div>
						<div style="margin-top:20px"><button style='width:360px;height:36px;background-color:rgb(228,0,17);color:white;font-size:24px;border-radius:5px;cursor:pointer;'
							 type="submit">登录</button></div>
					</form>

				</div>
			</div>
		</div>
	</div> 
  </div>
</template>

<script>
export default {
  name: 'hello',
  data () {
    return {
      msg: '迪锐克斯 dxdacer官网登录'
    }
  }
}
</script>
<style>
		input:-webkit-autofill {
			-webkit-box-shadow: 0 0 0px 1000px white inset;
		}

		input {
			background-color: rgb(255, 255, 255)!important;
			/* outline: none; */
			box-shadow: 2px 4px -6px #000;
		}

		html {
			width: 100%!important;
			height: 100%;
		}

		@media (max-width:768px) {
			body {
				position: absolute!important
			}
			#M-p {
				left: 0px!important;
				margin-left: 0px!important;
				width: 100%!important;
				top: 200px!important;
				background-image: url()!important;
			}
			#M-p>div {
				width: 100%!important;
				left: 0px!important;
			}
			.img {
				width: 0px!important;
			}
			.img:nth-of-type(1) {
				position: absolute!important;
				top: -20px!important;
				width: 220px!important;
				margin-top: 10px;
				left: calc((100% - 220px) / 2)!important;
			}
			.img1 {
				width: 100%!important;
				background-image: url(${pageContext.request.contextPath }/static/images/b-p.png)!important;
				position: absolute;
				top: 0px!important;
				background-size: 100% 100%!important
			}
			#M-p>div>img {
				width: 0px!important;
				height: 68px!important
			}
			#M-p>div>div {
				left: 0px!important;
				width: 100%!important;
				height: 210px!important;
				background-size: '100% 100%'!important;
				background-image: url()!important
			}
			input {
				width: calc(100% - 70px)!important;
				background-color: rgb(255, 255, 255)!important;
				
			}
			button {
				width: calc(100% - 20px)!important
			}
			p {
				top: 170px!important;
				color: #E50113!important;
				padding: 15px 0px!important;
				font-size: 1.2em!important;
				margin-top: 0px!important
			}
			p span {
				border-top: '1px solid #E50113'!important;
				padding-top: 10px!important
			}
		}
	</style>
        

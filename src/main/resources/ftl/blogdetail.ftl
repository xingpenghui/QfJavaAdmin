
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="format-detection" content="telephone=no" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="${hostInfo}/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${hostInfo}/css/swiper.min.css" rel="stylesheet" type="text/css" />
    <link href="${hostInfo}/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${hostInfo}/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="${hostInfo}/img/favicon.ico" rel="shortcut icon" />
    <link href="https://fonts.googleapis.com/css?family=Lato:700,900%7CDidact+Gothic" rel="stylesheet">
    <title>Opium</title>
</head>
<body>
<!-- LOADER -->
<div id="loader-wrapper">
    <div class="cssload-container">
        <div class="cssload-whirlpool"></div>
    </div>
</div>
<!-- LOADER -->

<!-- HEADER -->
<script type="application/javascript" src="${hostInfo}/js/bheader.js"></script>
<!-- HEADER -->


<!-- OVERLAY-VIDEO -->
<div class="overlay-wrapper height-min video">
    <div class="overlay-animation"></div>
    <div class="iframe-wrapper">
        <iframe class="full-size" src="${hostInfo}/img/transparent.png" allowfullscreen></iframe>
    </div>
    <div class="btn-close"><span></span><span></span></div>
</div>
<!-- end OVERLAY-VIDEO -->


<!-- content -->
<div id="content-wrapper">

    <div class="empty-space h35-xs h90-sm"></div>
    <div class="container-fluid-style2">
        <div class="swiper-banner">
            <div class="swiper-container" data-speed="1000" data-slides-per-view="1" data-breakpoints="1" data-xs-slides="1" data-sm-slides="1" data-md-slides="1" data-lg-slides="1">
                <div class="swiper-wrapper">
                    <div class="swiper-slide"><a href="#"><span class="bg" style="background-image: url(${hostInfo}/img/banner-img-1.jpg);"></span></a></div>
                    <div class="swiper-slide"><a href="#"><span class="bg" style="background-image: url(${hostInfo}/img/banner-img-2.jpg);"></span></a></div>
                    <div class="swiper-slide"><a href="#"><span class="bg" style="background-image: url(${hostInfo}/img/banner-img-3.jpg);"></span></a></div>
                </div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
                <div class="swiper-pagination"></div>
            </div>
        </div>
        <div class="container-fluid-in-wrapper">
            <div class="container-fluid-in">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <div class="empty-space h25-xs h55-md"></div>
                        <article>
                            <h1 class="h1-2">${info.title}</h1>
                            <div class="empty-space h20-xs"></div>
                            <span class="autor small-1">
                                    <span>2018-11-21</span>by<span> Feri</span>
                                    <label id="datam1">0</label><i class="fa fa-comments-o"></i> <label id="datam2">0</label> <i class="fa fa-heart-o"></i>
                                </span>
                            <div class="empty-space h30-xs"></div>
                           <#-- <p class="normal-l grey-dark">
                                ${info.content}
                            </p>-->

                        </article>
                    </div>
                </div>
                <div class="empty-space h30-xs"></div>
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="section">
                            <p class="text-left">
                                ${info.content}
                            </p>
                        </div>
                    </div>
                </div>

                <div class="empty-space h40-xs"></div>
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="tags">
                                    <span>标签</span>
                                    <a class="btn-style3" href="#">数据</a>
                                    <a class="btn-style3" href="#">存储</a>
                                    <a class="btn-style3" href="#">关系</a>
                                    <a class="btn-style3" href="#">表</a>
                                </div>
                            </div>
                            <div class="empty-space h20-xs h0-md"></div>
                            <div class="col-md-6">
                                <div class="follow">
                                    <span class="pull-left">分享</span>
                                    <a class="social" href="https://www.facebook.com/" target="_blank">
                                        <i class="fa fa-facebook" aria-hidden="true"></i>
                                    </a>
                                    <a class="social" href="https://www.instagram.com/" target="_blank">
                                        <i class="fa fa-instagram" aria-hidden="true"></i>
                                    </a>
                                    <a class="social" href="https://www.pinterest.com/" target="_blank">
                                        <i class="fa fa-pinterest-p" aria-hidden="true"></i>
                                    </a>
                                    <a class="social" href="https://www.twitter.com/" target="_blank">
                                        <i class="fa fa-twitter" aria-hidden="true"></i>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="empty-space h70-xs"></div>
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="author-block">
                            <div class="row">
                                <div class="col-sm-3">
                                    <img src="${hostInfo}/img/author-img.png" alt="">
                                    <div class="empty-space h10-xs"></div>
                                    <div class="follow-style2">
                                        <a href="https://www.facebook.com/"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                                        <a href="https://www.instagram.com/"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                                        <a href="https://www.pinterest.com/"><i class="fa fa-pinterest-p" aria-hidden="true"></i></a>
                                        <a href="https://www.twitter.com/"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                                    </div>
                                </div>
                                <div class="col-sm-9">
                                    <article>
                                        <p>作者</p>
                                        <h6 class="h6">Feri</h6>
                                        <p>
                                            Curabitur et ornare erat. Sed sit amet egestas enim. Fusce non lobort justo. In eleifend turpis nec libero vehi cula, vitae fermentum leo mattis. Etiam consectetur, nisl nec rhoncus consequat, dolor eni ultricies turpis, feugiat imperdiet turpis mauris quis massa
                                        </p>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="empty-space h50-xs h105-md"></div>
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <article>
                            <h2 class="h1-2">相关教程</h2>
                        </article>
                        <div class="empty-space h30-xs h60-md fl"></div>
                        <div class="swiper-with-pagination">
                            <div class="swiper-container" data-speed="1000" data-breakpoints="1" data-space="30" data-slides-per-view="3" data-xs-slides="1" data-sm-slides="2" data-md-slides="2" data-lg-slides="2">
                                <div class="swiper-wrapper">
                                    <div class="swiper-slide">
                                        <a href="#"><img src="${hostInfo}/img/blog-img-11.jpg" alt=""><span>基础</span></a>
                                        <div class="description">
                                            <a href="#" class="big-1 mouseover-2">二进制的来源？</a>
                                            <div class="empty-space h10-xs"></div>
                                            <div class="autor small-1">
                                                <span>2018-11-21</span>
                                                by <span>Feri</span>
                                            </div>
                                            <div class="empty-space h5-xs"></div>
                                            <p> 周所周知，二进制是计算机技术中应用最广泛的数值，二进制：使用0和1两个数字来表示的数</p>
                                        </div>
                                    </div>
                                    <div class="swiper-slide">
                                        <a href="#"><img src="${hostInfo}/img/blog-img-12.jpg" alt=""><span>基础</span></a>
                                        <div class="description">
                                            <a href="#" class="big-1 mouseover-2">Java的基本数据类型？</a>
                                            <div class="empty-space h10-xs"></div>
                                            <div class="autor small-1">
                                                <span>2018-11-21</span>
                                                by <span>Feri</span>
                                            </div>
                                            <div class="empty-space h5-xs"></div>
                                            <p>变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间</p>
                                        </div>
                                    </div>
                                    <div class="swiper-slide">
                                        <a href="#"><img src="${hostInfo}/img/blog-img-13.jpg" alt=""><span>数据库</span></a>
                                        <div class="description">
                                            <a href="#" class="big-1 mouseover-2">常用的DDL语句</a>
                                            <div class="empty-space h10-xs"></div>
                                            <div class="autor small-1">
                                                <span>2018-11-21</span>
                                                by <span>Feri</span>
                                            </div>
                                            <div class="empty-space h5-xs"></div>
                                            <p>DDL数据库定义语言，常用的语句有Create、Alter、Drop</p>
                                        </div>
                                    </div>
                                    <div class="swiper-slide">
                                        <a href="#"><img src="${hostInfo}/img/blog-img-11.jpg" alt=""><span>框架</span></a>
                                        <div class="description">
                                            <a href="#" class="big-1 mouseover-2">Spring的IOC</a>
                                            <div class="empty-space h10-xs"></div>
                                            <div class="autor small-1">
                                                <span>2018-11-21</span>
                                                by <span>Feri</span>
                                            </div>
                                            <div class="empty-space h5-xs"></div>
                                            <p>IOC控制反转，主要可以用来创建指定类的对象</p>
                                        </div>
                                    </div>
                                    <div class="swiper-slide">
                                        <a href="#"><img src="${hostInfo}/img/blog-img-12.jpg" alt=""><span>数据库</span></a>
                                        <div class="description">
                                            <a href="#" class="big-1 mouseover-2">MySQL的约束条件</a>
                                            <div class="empty-space h10-xs"></div>
                                            <div class="autor small-1">
                                                <span>2018-11-21</span>
                                                by <span>Feri</span>
                                            </div>
                                            <div class="empty-space h5-xs"></div>
                                            <p>在创建数据库表的时候，我们对于表的完整性会做约束，常用的约束条件</p>
                                        </div>
                                    </div>
                                    <div class="swiper-slide">
                                        <a href="#"><img src="${hostInfo}/img/blog-img-13.jpg" alt=""><span>架构</span></a>
                                        <div class="description">
                                            <a href="#" class="big-1 mouseover-2">微服务架构理念</a>
                                            <div class="empty-space h10-xs"></div>
                                            <div class="autor small-1">
                                                <span>2018-11-21</span>
                                                by <span>Feri</span>
                                            </div>
                                            <div class="empty-space h5-xs"></div>
                                            <p>微服务架构可以说是目前最为火爆的架构.</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-pagination-wrapper">
                                    <div class="swiper-pagination"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="empty-space h50-xs h105-md"></div>
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <article>
                            <h2 class="h1-2">评论</h2>
                        </article>
                        <div class="empty-space h30-xs h60-md fl"></div>
                        <div class="comments-wrapper">
                            <div class="comment">
                                <img src="${hostInfo}/img/icon-img-1.jpg" alt="">
                                <div class="description">
                                    <span class="big">磊神</span>
                                    <span>2018-11-21  17:47</span>
                                    <div class="empty-space h10-xs"></div>
                                    <p>
                                        那么除了关系型数据库之外还有什么？
                                    </p>
                                    <div class="empty-space h15-xs"></div>
                                    <a class="btn-style1" href="#"><span>回复</span></a>
                                </div>
                            </div>
                            <div class="empty-space h25-xs h45-md"></div>
                            <div class="comment">
                                <img src="${hostInfo}/img/icon-img-2.jpg" alt="">
                                <div class="description">
                                    <span class="big">大飞</span>
                                    <span>2018-11-21  17:47</span>
                                    <div class="empty-space h10-xs"></div>
                                    <p>有关于Redis的文章吗？</p>
                                    <div class="empty-space h15-xs"></div>
                                    <a class="btn-style1" href="#"><span>回复</span></a>
                                </div>
                                <div class="empty-space h25-xs h45-md"></div>
                                <div class="comment">
                                    <img src="${hostInfo}/img/icon-img-3.jpg" alt="">
                                    <div class="description">
                                        <span class="big">Feri</span>
                                        <span>2018-11-21  17:47</span>
                                        <div class="empty-space h10-xs"></div>
                                        <p>还在编写中……</p>
                                        <div class="empty-space h15-xs"></div>
                                        <a class="btn-style1" href="#"><span>回复</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="form-wrapper style2">
                            <div class="empty-space h35-xs"></div>
                            <h6 class="h7">留言</h6>
                            <div class="empty-space h30-xs"></div>
                            <form>
                                <div class="input-wrapper">
                                    <div class="input-style">
                                        <input id="inputName" name="name" type="text" class="input" required>
                                        <label for="inputName">姓名...</label>
                                    </div>
                                    <div class="input-style">
                                        <input id="inputEmail" name="email" type="text" class="input" required>
                                        <label for="inputEmail">邮箱...</label>
                                    </div>
                                    <div class="input-style textarea">
                                        <textarea id="inputMessage" name="message" class="input" required></textarea>
                                        <label for="inputMessage">留言内容...</label>
                                    </div>
                                </div>
                                <div class="empty-space h20-xs fl"></div>
                                <button class="btn-style1 style2" type="submit"><span>发送</span></button>
                            </form>
                            <div class="empty-space h50-xs h90-md"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end container-fluid-style2 -->

    <!-- footer -->
    <script type="application/javascript" src="${hostInfo}/js/footer.js"></script>
    <!-- footer -->

</div>
<!-- content -->

<script src="${hostInfo}/js/jquery-2.2.4.min.js"></script>
<script src="${hostInfo}/js/swiper.jquery.min.js"></script>
<script src="${hostInfo}/js/global.js"></script>
</body>
</html>

USE [Web_banson]
GO
/****** Object:  ForeignKey [FK__OrderDeta__order__4F47C5E3]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[OrderDetail] DROP CONSTRAINT [FK__OrderDeta__order__4F47C5E3]
GO
/****** Object:  ForeignKey [FK__Orders__account]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[Orders] DROP CONSTRAINT [FK__Orders__account]
GO
/****** Object:  ForeignKey [FK__Orders__shipping]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[Orders] DROP CONSTRAINT [FK__Orders__shipping]
GO
/****** Object:  ForeignKey [FK__Product__categor__58D1301D]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[Product] DROP CONSTRAINT [FK__Product__categor__58D1301D]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[OrderDetail] DROP CONSTRAINT [FK__OrderDeta__order__4F47C5E3]
GO
DROP TABLE [dbo].[OrderDetail]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[Orders] DROP CONSTRAINT [FK__Orders__account]
GO
ALTER TABLE [dbo].[Orders] DROP CONSTRAINT [FK__Orders__shipping]
GO
DROP TABLE [dbo].[Orders]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 03/23/2022 12:07:39 ******/
ALTER TABLE [dbo].[Product] DROP CONSTRAINT [FK__Product__categor__58D1301D]
GO
DROP TABLE [dbo].[Product]
GO
/****** Object:  Table [dbo].[Shipping]    Script Date: 03/23/2022 12:07:39 ******/
DROP TABLE [dbo].[Shipping]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 03/23/2022 12:07:39 ******/
DROP TABLE [dbo].[Account]
GO
/****** Object:  Table [dbo].[Categogies]    Script Date: 03/23/2022 12:07:39 ******/
DROP TABLE [dbo].[Categogies]
GO
/****** Object:  Table [dbo].[Categogies]    Script Date: 03/23/2022 12:07:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Categogies](
	[id] [int] NOT NULL,
	[name] [varchar](50) NULL,
	[description] [nvarchar](600) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Categogies] ([id], [name], [description]) VALUES (1, N'Son Romand - Glasting Water Tint', N'Sở dĩ son có tên gọi Glasting Water Tint vì son như được "phủ nước", khi bạn thoa son lên môi, sau khoảng 3 giây son sẽ xuất hiện hiệu ứng bóng và tạo một lớp nước trên môi. Độ bóng có thể điều chỉnh dễ dàng, tông màu được giữ bên dưới lớp bóng nên sẽ khó biến mất và có độ bám tốt. Đặc biệt sau lớp son bóng giúp môi căng mọng là lớp son lì hoàn hảo trên môi.')
INSERT [dbo].[Categogies] ([id], [name], [description]) VALUES (2, N'Son Romand - Zero Velvet Tint', N'Son kem lì Romand Zero Velvet Tint là son kem lì của thương hiệu Romand với kết cấu velvet xốp mềm cùng bảng màu đa dạng, dễ dùng cho đôi môi lên màu chuẩn, mịn mượt, nổi bật dù bạn ở bất cứ đâu. Romand Zero Velvet Tint có thân hình trụ tròn, vỏ nhám lì dễ dàng phân biệt màu son bên trong, kích thước cầm vừa tay. Chất son mềm mịn như bông, không hề bóng hay dễ bị lem khi lên môi. Độ bám nhiều giờ đồng hồ, son lên màu môi chuẩn chỉ với một lần tô.')
INSERT [dbo].[Categogies] ([id], [name], [description]) VALUES (3, N'Son Romand - Seethrough Matte Tint', N'Romand See-Through Matte Tint với phiên bản đặc biệt Hanbok Project với một diện mạo xinh xắn, trang nhã với chất son kem lì mịn mượt cùng với bảng màu trendy quyến rũ giúp da trở nên tươi sáng. Thiết kế lấy cảm hứng từ những tông màu pastel, nhẹ nhàng nhưng vẫn đầy sự cuốn hút, vì thế nhiều cô gái đã bị hạ gục ngay từ khi thấy bao bì xinh xắn này của dòng son Romand Se-Through Matte Tint. Kết cấu son có dạng mousse tint tạo cảm giác ẩm mịn, dễ tán đều, tệp ngay vào môi từ lần chạm đầu tiên tựa như không bôi gì.')
INSERT [dbo].[Categogies] ([id], [name], [description]) VALUES (4, N'Son Gilaa - Plumping Lip Serum', N'Điểm đặc biệt mới lạ trong BST Plumping Lip Serum chính là Serum dưỡng môi căng mọng không màu. Vừa có thể sử dụng là lớp dưỡng môi mềm mịn, vừa là lớp base hỗ trợ lớp son màu lên đều đẹp chuẩn sắc.')
INSERT [dbo].[Categogies] ([id], [name], [description]) VALUES (5, N'Son Gilaa - Long Wear Lip Cream', N'Thỏi Son Kem Li Cho Đôi Môi Nhiều Khuyết Điểm. Càng thoa sắc môi càng nét. Bảng màu siêu kinh điển phù hợp mọi tông da. Chứa nhiều thành phần dưỡng môi giải quyết đồng thời nhiều khuyết điểm(Shea Butter (Bơ Hạt Mỡ)Bảo vệ trước tác hại của tia UV từ ánh nắng mặt trời, hỗ trợ trị thâm môi; Macadamia (Hạt Mắc-ca)Duy trì độ ẩm mịn cho môi, chống khô và nứt nẻ môi.')
INSERT [dbo].[Categogies] ([id], [name], [description]) VALUES (6, N'Son Gilaa - Long Wear Lip Cream Rich Rosie', N'Đây là phiên bản nâng cấp của dòng son kem lì dành cho đôi môi nhiều khuyết điểm đình đám. Chất son được bổ sung thêm tinh chất Bisabolol làm sáng màu môi tự nhiên, kết hợp thành phần dưỡng ẩm cao giúp môi hạn chế được trình trạng khô, bong tróc.')
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[displayname] [varchar](50) NULL,
	[email] [varchar](50) NULL,
	[numberphone] [varchar](50) NULL,
	[isAdmin] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Account] ON
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (1, N'Admin', N'123456', N'Admin', N'Admin@gmail.com', N'0398492158', 1)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (2, N'Ruoi', N'123456', N'User', N'coco@gmail.com', N'0123456789', 0)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (3, N'Ca', N'123456', N'User', N'coco@gmail.com', N'032012349', 0)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (4, N'Lon', N'123456', N'User', N'coco@gmail.com', N'032012114', 0)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (5, N'Hoa', N'123456', N'User', N'coco@gmail.com', N'034133732', 0)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (6, N'bo', N'123456', N'bo thui', N'09778676ki@gmail.com', N'986755342', 0)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (7, N'nhi', N'123456', N'nhi ngu', N'ssdff@gmail.com', N'986755342', 0)
INSERT [dbo].[Account] ([id], [username], [password], [displayname], [email], [numberphone], [isAdmin]) VALUES (8, N'ha', N'123456', N'ha anh', N'09778676ki@gmail.com', N'0986755342', 0)
SET IDENTITY_INSERT [dbo].[Account] OFF
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shipping](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
	[phone] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[category_id] [int] NULL,
	[quantity] [int] NULL,
	[price] [int] NULL,
	[description] [nvarchar](500) NULL,
	[imagine] [varchar](max) NULL,
	[imagine2] [varchar](max) NULL,
	[imagine3] [varchar](max) NULL,
	[created_date] [date] NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (1, N'10 Chija Beige', 1, 10, 220, N'Son Tint bóng Romand Glasting Water Tint 10 Chija Beige mang sắc màu cam đào tươi tắn sẽ giúp đôi môi của bạn trông quyến rũ như những đóa hoa. Son có kết cấu tint bóng với lớp bóng trong suốt tách biệt với lớp satin màu rất đặc biệt.', N'https://assets-hebela.cdn.vccloud.vn/dict/1/inisrrinrgrdasiirt20211023152842romand/rdniinosnthaarndth20211026093012son-hanbok/irtorhriisnisroiih2021102610145510-chija-beige/tnididahsnssssnsds20211026101512thumb.png', N'https://ippondonz.co.nz/wp-content/uploads/2021/08/2164.jpg', N'https://img.joomcdn.net/2c8569509ec2f3789dbcf31e33172f49124e79f3_original.jpeg', CAST(0x7A440B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (2, N'04 Vintage Ocean', 1, 5, 175, N'Màu son đỏ nâu nhưng không quá trầm cũng không quá nổi là sự lựa chọn thích hợp cho các cô nàng yêu thích phong cách cổ điên, vintage. Chất son bóng nhưng không hề dính, tựa lớp nước trong trẻo bao bọc lấy đôi môi. Em này cần đánh nhiều lớp thì mới có thể lên rõ màu son và không sợ bị nặng môi', N'https://vn-live-05.slatic.net/p/c7f3edf7db77c9f84b145ad1221398cc.jpg_525x525q80.jpg', N'https://product.hstatic.net/1000379579/product/1_a66e5a6d88e044b09536101453f40e0d.jpg', N'https://bloganchoi.com/wp-content/uploads/2022/01/son-romand-glasting-water-tint.jpg', CAST(0x7A440B00 AS Date), 0)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (3, N'02 Red Drop', 1, 20, 175, N'Màu son như tên gọi trông như một quả táo đỏ, phù hợp với tất cả tông da và không làm xỉn vàng men răng. Kết hợp với chất son bóng, màu son sẽ khiến đôi môi bạn chúm chím như một quả táo căng mọng vậy', N'https://cf.shopee.vn/file/5f9c2b43e63974a2f29a5d981cffe628', N'https://img.websosanh.vn/v10/users/review/images/odtvl7rv321hv/son-kem-romand-glasting-water-tint-02.jpg?compress=85', N'https://www.abholic.com/image/cache/catalog/01_Products/ROMAND/1351-2_Glasting_Water_Tint_02_Red_Drop_3_light-550x550.jpg', CAST(0x41430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (4, N'06 Purple Shower', 1, 43, 175, N'Sắc son hồng tím cho các nàng vẻ ngoài vừa quyến rũ vừa cổ điển. Màu son có thể làm xỉn tông da nên các nàng nhớ trang điểm để tổng thể khuông mặt trông hài hòa hơn nhé!', N'https://m.media-amazon.com/images/I/71qK3nHXzvL._SL1500_.jpg', N'https://vn-test-11.slatic.net/p/d6b03a5983c7fa6c438fd532f4baf208.jpg', N'https://cf.shopee.vn/file/65fff91c7d68321c6ed210816794ab4d', CAST(0xAE410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (5, N'13 Berry Violet', 1, 8, 220, N'13 Berry Violet đỏ đỏ hồng hồng tim tím tone lạnh 10 điểm cho đêm Noel.Tips là mix với bảng phấn mắt tone hồng của Romand nữa thì nguyên combo quẩy Noel xinh thiệt xinh luôn nha', N'https://media.shopat24.com/pdzoom/485586-00-lip-tint-rom-nd.jpg', N'https://product.hstatic.net/200000223113/product/romand_glasting_water_tint_3_a2c18209d8ef4989bd927ba114918121.jpg', N'https://product.hstatic.net/1000317169/product/_13_8115705987774ceba462eb6acd04d385.jpg', CAST(0x97400B00 AS Date), 0)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (7, N'06 Deep Soul', 2, 17, 169, N'Đỏ gạch siêu hot thì đỏ nâu cũng không hề kém cạnh đâu nhé. Em này luôn trong tình trạng cháy hàng. Sắc đỏ nâu vừa đủ tươi vừa đủ trầm, lên môi tuyệt đẹp.', N'https://img.ruten.com.tw/s7/08b/454/sanri4/7/14/22052396731156_992.jpg', N'https://cf.shopee.vn/file/056a32e43c54ba1497a14cca8971fc8b', N'https://cf.shopee.vn/file/b2963d6825acbb9cfe0bb11960b96d12', CAST(0x16420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (8, N'05 Witty', 2, 42, 169, N' Đây là màu cực kỳ hợp với làn da của người Châu Á. Đỏ gạch tôn da rất tốt. Witty được tạo nên từ sự kết hợp của đỏ, cam và chút ánh nâu. Chỉ cần thoa một chút xíu thôi là gương mặt nàng đã tràn đầy sức sống rồi.', N'https://cf.shopee.vn/file/65a0fbac09b9914d05acf356eebf7f4d', N'https://cf.shopee.vn/file/52c7887d5755288d2675ba9fe4dd3ce5', N'https://cf.shopee.vn/file/fef0cb1ee68330d61a5523cfb0d9e7b4', CAST(0x58440B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (9, N'16 Burny Nude', 2, 47, 169, N'Sắc son hồng pha nâu ánh cam chuẩn MLBB trendy phù hợp với mọi tone da, lại không hề làm xỉn men răng tẹo nào, lập tức sẽ cho bạn một diện mạo tươi tắn không kém phần thu hút đó', N'https://ph-live-05.slatic.net/p/459aebaa825daf6cf96a90ce130db631.jpg_2200x2200q80.jpg_.webp', N'https://cf.shopee.vn/file/6c7bd7375c53e26a2bc0df1e254a1dd0', N'https://shanshe.vn/wp-content/uploads/2021/09/mau-son-hop-voi-da-ngam-13-min.jpg', CAST(0x90400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (10, N'18 Petal Tassel', 2, 24, 169, N'Màu đào nude, màu sắc mang đến cho bạn đôi môi hồng hào tự nhiên, không hề bợt', N'https://img.alicdn.com/imgextra/i2/2277902067/O1CN01gNXoaW1R8jIknQyM4_!!2277902067.png', N'https://cf.shopee.vn/file/fa161bcbf7153d8551113018e3522424', N'https://mint07.com/wp-content/uploads/2021/05/thang45-recovered-31.png', CAST(0x8B440B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (11, N'20 Berry Brown', 2, 25, 169, N'Berry Brown màu sắc là sự kết hợp hài hòa giữa màu lá đỏ và dâu rừng', N'https://vn-live-05.slatic.net/p/bf48c30a8a1936c300e55cf6fb7447be.jpg_525x525q80.jpg', N'https://pbs.twimg.com/media/EwfaYdmVkAQIstN?format=jpg&name=large', N'https://filebroker-cdn.lazada.vn/kf/S130eced7cbe44c2d908bf393dcc306d3m.jpg', CAST(0x12430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (12, N'21 Villain Vest', 2, 47, 169, N'Màu đỏ mận cổ điển. Tông màu khá trầm và có ánh hồng hợp với mùa đông, hợp với những bữa tiệc cuối năm. Tôn da nhưng khi dùng màu này các bạn nên makeup 1 chút trông sẽ quyến rũ hơn.', N'https://product.hstatic.net/1000006063/product/20r_f587640821474e5fbaa40909bd77335f_1024x1024.jpg', N'https://chiaki.vn/upload/news/content/2021/01/19ce0b60a4f90e355a695c50480c7eeb-jpg-1610347159-11012021133919.jpg', N'https://cf.shopee.vn/file/71b5deeb1cfbb7e25f1620f1cd30842f', CAST(0x96430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (13, N'22 Grain Nude', 2, 9, 169, N'Đây là màu son dễ dùng cho mọi tone da nhé, nhất là đối với những bạn học sinh sinh viên đang cần một sắc môi nhẹ nhàng hằng ngày để đi học. Màu son nhẹ nhàng nên đánh lòng môi hay full môi đều rất xinh nhé. ', N'https://nanashop.vn/upload/product/372175509015.jpg', N'https://bloganchoi.com/wp-content/uploads/2021/05/mau-son-22-grain-nude.jpg', N'https://filebroker-cdn.lazada.vn/kf/Sa6304f932a81496188318a4a30a3bacep.jpg', CAST(0x6F430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (14, N'25 Nerd Pink', 2, 39, 169, N'Màu hỏng phai, thêm sắc hồng nhẹ, tự nhiên cho môi thích hợp với tông da lạnh', N'http://cdn.shopify.com/s/files/1/2779/3344/products/34f89f9e-5a2d-4a53-a135-8e945465f73a.jpg?v=1632146520', N'https://cf.shopee.vn/file/cf94bb7f0bf0a1393307f839dbfff3ed', N'https://bloganchoi.com/wp-content/uploads/2021/05/mau-son-25-nerk-pink-romand-vintage.jpg', CAST(0xCE400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (15, N'06 Burn Wrap', 3, 25, 200, N'Màu 6 Burn Wrap là màu đỏ nâu, có base hồng. Màu son này có độ trầm, giúp tôn da và làm trắng răng. Cùng với màu số 4 Red Chain thì màu số 6 Burn Wrap cũng là màu son bán chạy nhất của Romand See Through Matte Tint', N'https://cdn-amz.fadoglobal.io/images/I/41evzxBplpL.jpg', N'https://cf.shopee.vn/file/4a462aa024e2ad3b860a83c03b32d317', N'https://media.karousell.com/media/photos/products/2021/11/1/sale_romand_seethrough_matte_t_1635764656_be51c57c', CAST(0xC8420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (16, N'01 Pink Fold', 3, 25, 200, N'Mở đầu các bảng son Hàn Quốc luôn là một thỏi son màu hồng tuy ngọt ngào nhưng khá kén người dùng. Đặc biệt các nàng nên trang điểm để khuôn mặt hài hòa hơn hoặc chỉ dùng son lòng môi tạo hiệu ứng môi ửng hồng chúm chím nhé.', N'https://koreanbestbuy.com/pub/media/catalog/product/cache/75eed2686e01eb22cb4050b2f40ddf97/r/o/rom_nd_see_through_matte_tint_01_1.jpg', N'https://cf.shopee.vn/file/19740c3a88f5c54a35db8b8fae31e25f', N'https://cf.shopee.vn/file/a948730dc8118678c9c45087bb8133f7', CAST(0x03410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (17, N'05 Brick Cover', 3, 13, 200, N'Màu 05- Brick Cover: cam đỏ gạch - Không kén tone da. Chất son romand siêu mềm, lì mà mướt rượt, bám vào môi như môi tự nhiên luôn. ', N'https://cf.shopee.vn/file/49efb97c5ead6e39e4b93064feeae9e9', N'https://cf.shopee.vn/file/ef1e2fe531815145902ee17709e122e6', N'https://bloganchoi.com/wp-content/uploads/2019/08/mau-nam.jpg', CAST(0xBD400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (18, N'07 Onion Beige', 3, 43, 180, N'Màu nude tông ấm thêm sức sống cho đôi môi #nudebeige #MLBB', N'https://product.hstatic.net/200000223113/product/romand_see-through_matte_tint_07_onion_beige_978d526b263c4f91a20aaf0a0202c83d_master.png', N'http://product.hstatic.net/1000317169/product/_07_fd2edf321dff47db83c2afd79c3a3cf6_grande.jpg', N'https://assets-hebela.cdn.vccloud.vn/dict/1/inisrrinrgrdasiirt20211023152842romand/rdniinosnthaarndth20211026093012son-hanbok/ndgthrgiisiinomtrh2021102609415407-onion-beige/tisihdgintrhiigisn20211026094208bst/nsntnmmrhnsosrnshh202110260946463.png', CAST(0xC2400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (19, N'08 Flower Coral', 3, 45, 180, N'Màu san hô trầm nhưng không ảm đạm, đem đến bầu không khí láng mạn #màusanhôlángmạn #mutecoral', N'https://cdn.diemnhangroup.com/thegioilamdep/2021/11/son-kem-li-romand-see-through-matte-tint-hanbok-08-flower-coral-1.jpg', N'https://cf.shopee.vn/file/eb90d47e07b3e2f08fe9fbb7d943746a', N'https://cf.shopee.vn/file/fefd729db0d1e4555335a67e1b63995e', CAST(0x32420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (20, N'09 Maple Red', 3, 16, 180, N'Màu đỏ nâu trầm quyến rũ, tôn làn da trắng sáng #đócổđiển #đótrầm', N'https://bizweb.dktcdn.net/100/379/179/products/493f392e-886b-4b95-bd7d-635ec2cb637b-jpeg.jpg?v=1606422513347', N'https://mint07.com/wp-content/uploads/2021/04/son-kem-romand-see-through-matte-tint-09.jpg', N'https://cf.shopee.vn/file/cb1f7d633d61f6942a05921cb42a293b', CAST(0x4A420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (21, N'10 Blush Purple', 3, 50, 180, N'Màu tím gam lạnh nhưng không mang cảm giác lạnh, có thể sử dụng hàng ngày #màuhoađóquyên #tímtrầm', N'https://assets-hebela.cdn.vccloud.vn/dict/1/inisrrinrgrdasiirt20211023152842romand/rdniinosnthaarndth20211026093012son-hanbok/minnstdidrtsahtnns2021102610025413-berry-violet/tdnritsordodhssrtn20211026100306thumb.png', N'http://product.hstatic.net/1000317169/product/_10_ffc8407e988d41b1906599f1c4915b49_grande.jpg', N'https://product.hstatic.net/200000223113/product/romand_see-through_matte_tint_2_4d41c5890f1440d4a1c6ed761bb5579b_master.jpg', CAST(0x2C410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (22, N'01 Athena', 4, 16, 298, N'Giúp gương mặt "tây" hơn vài phần. Đồng thời, tông da cũng sáng hồng hơn đáng kể.', N'https://media.hasaki.vn/catalog/product/s/o/son-moi-gilaa-plumping-lip-serum-01-athena-nau-cam-caramel-3-6g-1.jpg', N'https://cf.shopee.vn/file/8e4a311c3d8f275a5270f52db1af901c', N'https://cf.shopee.vn/file/9d82cca2fc7770415be4aac1fc6676b1', CAST(0xE3410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (23, N'02 Venus', 4, 25, 298, N'Mang trong mình tông màu đỏ huyền thoại nhưng cuốn hút hơn nhờ sự kết hợp với tông màu nâu trầm ấm.', N'https://media.hasaki.vn/catalog/product/s/o/son-moi-gilaa-plumping-lip-serum-02-venus-mau-do-dat-3-6g-1.jpg', N'https://cf.shopee.vn/file/52174403b761f5c56b39d121e454d72f', N'https://cf.shopee.vn/file/5246dc94db919e4ed136e652273683ec', CAST(0xCB400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (24, N'03 Hestia', 4, 31, 298, N'Là chất dẫn sáng tạo cho nhiều phong cách trang điểm khác nhau, giúp vẻ ngoài rạng rỡ, năng động và trẻ trung.', N'https://media.hasaki.vn/catalog/product/s/o/son-moi-gilaa-plumping-lip-serum-03-hestia-nau-chocolate-3-6g-1.jpg', N'https://ilift.com.vn/images/thumbs/0000711_son-moi-gilaa-plumping-lip-serum-03-hestia-nau-chocolate-36g-plumping-lip-serum-04-hestia_550.jpeg', N'https://chonmyphamtot.com/wp-content/uploads/2021/07/Son-Gilaa-Plumping-Lip-Serum-03-Hestia.jpg', CAST(0xF3400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (25, N'04 Hera', 4, 44, 298, N'Vừa quyến rũ, nóng bỏng lại vừa pha chút gì đó lãng mạn và thanh lịch. Đó là một vẻ đẹp rất riêng và rất cuốn hút.', N'https://media.hasaki.vn/catalog/product/s/o/son-moi-gilaa-plumping-lip-serum-04-hera-mau-do-gach-3-6g-1.jpg', N'data:image/jpeg;base64,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', N'https://www.watsons.vn/medias/zoom-extra1-210621.jpg?context=bWFzdGVyfHByb2R1Y3RJbWFnZS96b29tfDEzNzA4NnxpbWFnZS9qcGVnfHByb2R1Y3RJbWFnZS96b29tL2gzOC9oNWEvOTI2Mjc3Mjk3NzY5NC5qcGd8NjVkNDMzMTFkMWY3NGI4MWUxNWIyODczMDgxNDM2ODFiMTJlMTczMTI4MzdiY2MyMTljYjhkN2E4NGYyYWRjYw', CAST(0x7E410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (26, N'05 Artemis', 4, 38, 298, N'Kết hợp hoàn hảo sắc cam ấm áp với sắc nâu và sắc đỏ trầm ấm. Mới lạ, phá cách mà không kém phần duyên dáng và đáng yêu.', N'https://media.hasaki.vn/catalog/product/s/o/son-moi-gilaa-plumping-lip-serum-05-artemis-do-cam-chay-3-6g-1_img_358x358_843626_fit_center.jpg', N'https://ilift.com.vn/images/thumbs/0000715_son-moi-gilaa-plumping-lip-serum-05-artemis-do-cam-chay-36g-plumping-lip-serum-05-artemis_550.jpeg', N'https://product.hstatic.net/200000117693/product/gilaa_products_swatchlipserum_210330-6_2d77afdf00074c02abc9275a610bb536.jpg', CAST(0xA5400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (27, N'06 Kore', 4, 36, 298, N'Là màu son “quốc dân”, phù hợp với nhiều loại da và phong cách trang điểm khác nhau. Đánh lòng môi hay full môi đều sành điệu và nổi bật.', N'https://media.hasaki.vn/catalog/product/s/o/son-moi-gilaa-plumping-lip-serum-06-kore-mau-nau-do-3-6g-1.jpg', N'https://ilift.com.vn/images/thumbs/0000717_son-moi-gilaa-plumping-lip-serum-06-kore-mau-nau-do-36g-plumping-lip-serum-06-kore_550.jpeg', N'https://www.watsons.vn/medias/zoom-extra1-210623.jpg?context=bWFzdGVyfHByb2R1Y3RJbWFnZS96b29tfDExMjEzOXxpbWFnZS9qcGVnfHByb2R1Y3RJbWFnZS96b29tL2g3ZC9oMWEvOTI2MjgwNTg0Mzk5OC5qcGd8YmU2NTM5YzdhZGI2OWQxZGE0MTJiNTQ4ZmFhMTgxYTA1OGE5YmJkOTM2NzI0MDNlMWIwYzg3M2VmZjhjZTdmNA', CAST(0x5B430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (28, N'01 Glad Day', 5, 47, 175, N'Kết hợp tinh tế giữa sắc đỏ truyền thống với sắc nâu đất (base cam). Màu son không kén tông da.', N'https://media.hasaki.vn/catalog/product/s/o/son-kem-li-gilaa-the-he-moi-01-glad-day-mau-do-nau-5g-4.jpg', N'https://cdn.chiaki.vn/unsafe/0x800/left/top/smart/filters:quality(75)/https://chiaki.vn/upload/product/2021/01/son-kem-li-gilaa-01-glad-day-do-nau-ca-tinh-sang-da-5ff2833f7f403-04012021095351.jpg', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0x8F430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (29, N'02 Lovely Day', 5, 20, 175, N'Hợp với kiểu trang điểm mắt khói khi đánh full môi, nếu chỉ trang điểm nhẹ nhàng thì đánh lòng môi cũng rất xinh.', N'https://media.hasaki.vn/catalog/product/s/o/son-kem-li-gilaa-the-he-moi-02-lovely-day-mau-do-nau-tram-5g-1.jpg', N'https://cf.shopee.vn/file/5711a7f0fc9c87c3cd3e37d0720e3dfc', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0x62410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (30, N'03 Sunshine Day', 5, 11, 175, N'Son nâu đất tạo được vẻ ngoài vừa cá tính vừa cuốn hút, rất thích hợp với những cô nàng năng động.', N'https://salt.tikicdn.com/cache/400x400/ts/product/dc/22/28/4212e9828799b3019a8edf1146a92599.png', N'https://cf.shopee.vn/file/42501e13a8551513a4fb7dfc618d3894', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0xD6400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (31, N'04 First Day ', 5, 40, 175, N'Màu son thích hợp cho những cô gái theo phong cách dịu dàng, nhẹ nhàng nhưng không kém phần cuốn hút.', N'https://vn-live-05.slatic.net/p/f419f7bf6d8bc9e2df3b27385db80f8b.png_525x525q80.jpg', N'https://cf.shopee.vn/file/5150539ddae738fae945a90ad04e1448', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0xBA410B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (32, N'05 Gloomy Day', 5, 24, 175, N'Màu cam cháy chưa bao giờ kén tông da hoặc dáng khuôn mặt. Dùng màu son này khi makeup hoặc để tự nhiên đều rất đẹp.', N'https://vn-live-05.slatic.net/p/efe52711da27c5740067a86a7be24440.png_525x525q80.jpg', N'https://cf.shopee.vn/file/ea9a744cbf74653f142f3052413d890a', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0xD4400B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (33, N'06 Rainy Day', 5, 17, 175, N'Tông màu phù hợp cả 4 mùa trong năm và không kén màu da, đây luôn là màu son yêu thích của nhiều người.', N'https://media.hasaki.vn/catalog/product/s/o/son-kem-li-gilaa-the-he-moi-06-rainy-day-mau-do-cam-5g-1.jpg', N'https://bloganchoi.com/wp-content/uploads/2019/11/son-mau-do-cam-rainy-day-galaa.jpg', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0xF9430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (34, N'07 Red Letter Day', 5, 41, 175, N'Sắc đỏ thuần khiết luôn là màu son kinh điển của mọi thời đại.', N'https://vn-test-11.slatic.net/p/3f718abc031487f698ee948a0a94217d.png', N'https://img.watsonsvn.com/trading/td/V000496-OQR/Gilaa-PinkerBell-12-11/8809491944433-content1.jpg', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0x20430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (35, N'08 Take A Sip', 6, 44, 199, N'Nguyên vẹn sự kiêu sa của hoa hồng đỏ, một màu sắc xinh đẹp và vừa vặn trên môi, khiến đối phương say mê nhìn ngắm. ', N'https://media.hasaki.vn/catalog/product/s/o/son-kem-li-gilaa-rich-rosie-08-take-a-sip-do-ruou-vang-5g-7.jpg', N'https://bloganchoi.com/wp-content/uploads/2021/11/gilaa-long-wear-lip-cream-mau-8-take-a-sip.jpg', N'https://cf.shopee.vn/file/76d0669339071899c63b084e1c87039d', CAST(0x2F440B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (36, N'09 Hei Hei', 6, 43, 199, N'Một chút sắc đỏ pha thêm hồng đào, tiệp với màu phấn má đáng yêu. Màu son này không chỉ tươi tắn tự nhiên, mà còn khiến mỗi ngày thêm đặc biệt!', N'https://media.hasaki.vn/catalog/product/s/o/son-kem-li-gilaa-rich-rosie-09-hei-hei-mau-do-hong-dao-5g-7.jpg', N'https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2021/11/gilaa-long-wear-lip-cream-mau-9-hei-hei-696x385.jpg?fit=696%2C20000&quality=95&ssl=1', N'https://cf.shopee.vn/file/14b5dce31825e29b327c47bc3af0c737', CAST(0x16430B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (37, N'10 May Beauty', 6, 23, 199, N'Màu son dịu dàng như hoa hồng Centifolia, tạo nên điểm nhấn thanh tú và ngọt ngào cho những quý cô. Lựa chọn quy chuẩn có thể dùng bất cứ lúc nào.', N'https://product.hstatic.net/200000061028/product/1_31e025a1535b4462a004e60bedfa66a1_1024x1024.jpg', N'https://www.watsons.vn/medias/zoom-side-211840.jpg?context=bWFzdGVyfHNpZGUvem9vbXw1NjQ2MTJ8aW1hZ2UvanBlZ3xzaWRlL3pvb20vaGIwL2gxZC85MzIyMjA1NjEwMDE0LmpwZ3wyMThmZmE5MGJmNGJhYTU3MjkwMmYyZDE0OGQxMGZiNTNiNDcwNjU4ZmUwMzFjNTE0MGNlMWM2NzM4NDY0YmU4', N'https://chaustore.vn/wp-content/uploads/2020/07/logo-thuong-hieu-gilaa-1.jpg', CAST(0x32420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (38, N'11 Set Sail', 6, 11, 199, N'Điệu đà phá cách, ẩn chứa câu chuyện nàng Rose, đây là màu son sẽ đổ dồn mọi ánh mắt lên đôi môi bạn. Sắc cam ấm ngọt để lại dư âm đậm sâu.', N'https://product.hstatic.net/200000061028/product/1_ce11d28216914216b63dc876ccbc733f_1024x1024.jpg', N'https://product.hstatic.net/200000348449/product/7d576748dc91cee90a2c8ca6bc_master-min_10ce712a98cf48168cf77bde2a475f13_062507aff9a54eeb9fb6b4064c4acb20_master.jpg', N'https://www.watsons.vn/medias/zoom-side-211841.jpg?context=bWFzdGVyfHNpZGUvem9vbXw1OTA0ODB8aW1hZ2UvanBlZ3xzaWRlL3pvb20vaGY3L2gxMy85MzIyNTI5OTQ3Njc4LmpwZ3xhNzQ0Y2VkNWYyMzkyODk5ZjIyZGI4ZmQyMjdhMWYzMGRmNjBjMjE2NDk4OWNhZTM1YTA2OGExMTAxYzY3YjE4', CAST(0x8A420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (39, N'12 Lavish', 6, 19, 199, N'Đánh nhạt sẽ cho ra màu cam tự nhiên, hệt màu hoa hồng Juliet. Khi chồng nhiều lớp, màu môi sẽ có sắc đất rõ nét, lôi cuốn cực kỳ.', N'https://product.hstatic.net/200000061028/product/1_ce11d28216914216b63dc876ccbc733f_1024x1024.jpg', N'https://salt.tikicdn.com/cache/525x525/ts/product/9a/80/05/03c2283d78d14e80041f012366daae10.jpg', N'https://cf.shopee.vn/file/a969f5323585033a4c3fa135fcf2678d', CAST(0xC6420B00 AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [category_id], [quantity], [price], [description], [imagine], [imagine2], [imagine3], [created_date], [status]) VALUES (40, N'13 Curse Reverse', 6, 11, 199, N'Khoảnh khắc kết thúc của cánh hồng úa tàn, màu son chứa đựng niềm yêu thích bị giấu kín. Sức hấp dẫn khơi gợi tinh thần chiếm hữu tột độ.', N'https://product.hstatic.net/200000061028/product/1_ce11d28216914216b63dc876ccbc733f_1024x1024.jpg', N'https://cf.shopee.vn/file/b18b2338d016f13258f0de695c5af0ed', N'https://www.watsons.vn/medias/zoom-side-211843.jpg?context=bWFzdGVyfHNpZGUvem9vbXw1MjIwMjd8aW1hZ2UvanBlZ3xzaWRlL3pvb20vaDg2L2hlZC85MzIyMjY2ODg2MTc0LmpwZ3xhMTBhYTM0OWExN2EwN2FlMGZlY2I4ZWY1OTRiNjI3YzhkZWFmMzc1ODgyOWE4YTM1ZTI1ODhmMGYwZGNiODhj', CAST(0x73410B00 AS Date), 1)

SET IDENTITY_INSERT [dbo].[Product] OFF
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_id] [int] NULL,
	[totalPrice] [float] NULL,
	[note] [text] NULL,
	[created_date] [date] NULL,
	[shipping_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[order_id] [int] NULL,
	[productName] [nvarchar](255) NULL,
	[productImage] [nvarchar](255) NULL,
	[productPrice] [float] NULL,
	[quantity] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD FOREIGN KEY([order_id])
REFERENCES [dbo].[Orders] ([id])
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK__Orders__account] FOREIGN KEY([account_id])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK__Orders__account]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK__Orders__shipping] FOREIGN KEY([shipping_id])
REFERENCES [dbo].[Shipping] ([id])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK__Orders__shipping]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([category_id])
REFERENCES [dbo].[Categogies] ([id])
GO

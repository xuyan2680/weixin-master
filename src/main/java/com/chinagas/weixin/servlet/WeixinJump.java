�}Z  �  
\��`�T���u
��� �~���v��S	�v]F��&8��A����IVX�(�m�qRLo�|�jIj5����6�^�.�t;��/��Ɩ���w���0����-�T����m��5�;!�R�ŏu��u_��O�wY���L�Blw�\W4�܄��ۋ��ܡVƑAeޯ�.��/�A�m�[�k���߬I0�4d�6�t���;��'r�����u���iI�S�U��(h�����۞�x��d~ݑ�PW�A,�nۘ{O	L1a=Pc�Vr��S�xh j�M� ��(���=
84�;��z@�wۤ��e�$�kEF��S�G�:�iA��C���#�jx3���u���Չ����)�0����5YմWZ�o6~
ڀȣ�u�*n��I^[��?��:9L=Ԏ7�d)�Y@,�ksq�j0}o8bach�ZCBZb�/D���v�"�bt����MDO
"ݼ0���x$� �n���8��SqI�y��soPion {
		String code = req.getParameter("code");
		Oa2AccessToken ot = WeixinUtil.getOa2AccessToken(code);
		resp.sendRedirect("jump.jsp?openid="+ot.getOpenid());
	}
}

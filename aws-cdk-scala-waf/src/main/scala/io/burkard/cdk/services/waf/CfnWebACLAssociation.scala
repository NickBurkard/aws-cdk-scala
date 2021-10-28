package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWebACLAssociation {

  def apply(
    internalResourceId: String,
    resourceArn: Option[String] = None,
    webAclId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation =
    software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn.orNull)
      .webAclId(webAclId.orNull)
      .build()
}

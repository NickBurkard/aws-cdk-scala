package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACLAssociation {

  def apply(
    internalResourceId: String,
    resourceArn: String,
    webAclId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation =
    software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn)
      .webAclId(webAclId)
      .build()
}

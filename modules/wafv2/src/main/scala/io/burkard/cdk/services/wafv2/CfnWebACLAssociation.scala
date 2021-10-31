package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACLAssociation {

  def apply(
    internalResourceId: String,
    resourceArn: Option[String] = None,
    webAclArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnWebACLAssociation =
    software.amazon.awscdk.services.wafv2.CfnWebACLAssociation.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn.orNull)
      .webAclArn(webAclArn.orNull)
      .build()
}

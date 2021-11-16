package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACLAssociationProps {

  def apply(
    resourceArn: String,
    webAclArn: String
  ): software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps =
    (new software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps.Builder)
      .resourceArn(resourceArn)
      .webAclArn(webAclArn)
      .build()
}

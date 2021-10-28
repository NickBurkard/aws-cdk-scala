package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWebACLAssociationProps {

  def apply(
    resourceArn: Option[String] = None,
    webAclArn: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps =
    (new software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps.Builder)
      .resourceArn(resourceArn.orNull)
      .webAclArn(webAclArn.orNull)
      .build()
}

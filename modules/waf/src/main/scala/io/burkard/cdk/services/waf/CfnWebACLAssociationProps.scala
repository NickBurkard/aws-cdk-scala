package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWebACLAssociationProps {

  def apply(
    resourceArn: Option[String] = None,
    webAclId: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps =
    (new software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder)
      .resourceArn(resourceArn.orNull)
      .webAclId(webAclId.orNull)
      .build()
}

package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceProps {

  def apply(
    resourceArn: Option[String] = None,
    useServiceLinkedRole: Option[Boolean] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnResourceProps =
    (new software.amazon.awscdk.services.lakeformation.CfnResourceProps.Builder)
      .resourceArn(resourceArn.orNull)
      .useServiceLinkedRole(useServiceLinkedRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleArn(roleArn.orNull)
      .build()
}

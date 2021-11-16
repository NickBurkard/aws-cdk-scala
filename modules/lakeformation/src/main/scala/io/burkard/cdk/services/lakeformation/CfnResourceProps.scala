package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceProps {

  def apply(
    resourceArn: String,
    useServiceLinkedRole: Boolean,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnResourceProps =
    (new software.amazon.awscdk.services.lakeformation.CfnResourceProps.Builder)
      .resourceArn(resourceArn)
      .useServiceLinkedRole(useServiceLinkedRole)
      .roleArn(roleArn.orNull)
      .build()
}

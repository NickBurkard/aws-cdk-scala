package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserHierarchyGroupProps {

  def apply(
    name: Option[String] = None,
    parentGroupArn: Option[String] = None,
    instanceArn: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps =
    (new software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps.Builder)
      .name(name.orNull)
      .parentGroupArn(parentGroupArn.orNull)
      .instanceArn(instanceArn.orNull)
      .build()
}

package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserHierarchyGroupProps {

  def apply(
    name: String,
    instanceArn: String,
    parentGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps =
    (new software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps.Builder)
      .name(name)
      .instanceArn(instanceArn)
      .parentGroupArn(parentGroupArn.orNull)
      .build()
}

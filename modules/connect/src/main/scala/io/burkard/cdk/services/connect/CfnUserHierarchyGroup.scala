package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserHierarchyGroup {

  def apply(
    internalResourceId: String,
    name: String,
    instanceArn: String,
    parentGroupArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.connect.CfnUserHierarchyGroup =
    software.amazon.awscdk.services.connect.CfnUserHierarchyGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .instanceArn(instanceArn)
      .parentGroupArn(parentGroupArn.orNull)
      .build()
}

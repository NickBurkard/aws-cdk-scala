package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RowLevelPermissionDataSetProperty {

  def apply(
    permissionPolicy: String,
    arn: String,
    formatVersion: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty.Builder)
      .permissionPolicy(permissionPolicy)
      .arn(arn)
      .formatVersion(formatVersion.orNull)
      .namespace(namespace.orNull)
      .build()
}

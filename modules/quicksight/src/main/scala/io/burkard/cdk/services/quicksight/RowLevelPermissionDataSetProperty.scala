package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RowLevelPermissionDataSetProperty {

  def apply(
    formatVersion: Option[String] = None,
    namespace: Option[String] = None,
    permissionPolicy: Option[String] = None,
    arn: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty.Builder)
      .formatVersion(formatVersion.orNull)
      .namespace(namespace.orNull)
      .permissionPolicy(permissionPolicy.orNull)
      .arn(arn.orNull)
      .build()
}

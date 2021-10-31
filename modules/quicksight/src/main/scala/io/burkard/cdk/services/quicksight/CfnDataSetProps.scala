package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDataSetProps {

  def apply(
    fieldFolders: Option[Map[String, _]] = None,
    awsAccountId: Option[String] = None,
    columnLevelPermissionRules: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    importMode: Option[String] = None,
    physicalTableMap: Option[Map[String, _]] = None,
    permissions: Option[List[_]] = None,
    dataSetId: Option[String] = None,
    ingestionWaitPolicy: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty] = None,
    rowLevelPermissionDataSet: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty] = None,
    logicalTableMap: Option[Map[String, _]] = None,
    name: Option[String] = None,
    columnGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSetProps =
    (new software.amazon.awscdk.services.quicksight.CfnDataSetProps.Builder)
      .fieldFolders(fieldFolders.map(_.asJava).orNull)
      .awsAccountId(awsAccountId.orNull)
      .columnLevelPermissionRules(columnLevelPermissionRules.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .importMode(importMode.orNull)
      .physicalTableMap(physicalTableMap.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .dataSetId(dataSetId.orNull)
      .ingestionWaitPolicy(ingestionWaitPolicy.orNull)
      .rowLevelPermissionDataSet(rowLevelPermissionDataSet.orNull)
      .logicalTableMap(logicalTableMap.map(_.asJava).orNull)
      .name(name.orNull)
      .columnGroups(columnGroups.map(_.asJava).orNull)
      .build()
}

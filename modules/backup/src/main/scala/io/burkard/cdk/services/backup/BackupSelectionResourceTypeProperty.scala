package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupSelectionResourceTypeProperty {

  def apply(
    iamRoleArn: String,
    selectionName: String,
    conditions: Option[AnyRef] = None,
    notResources: Option[List[String]] = None,
    resources: Option[List[String]] = None,
    listOfTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder)
      .iamRoleArn(iamRoleArn)
      .selectionName(selectionName)
      .conditions(conditions.orNull)
      .notResources(notResources.map(_.asJava).orNull)
      .resources(resources.map(_.asJava).orNull)
      .listOfTags(listOfTags.map(_.asJava).orNull)
      .build()
}

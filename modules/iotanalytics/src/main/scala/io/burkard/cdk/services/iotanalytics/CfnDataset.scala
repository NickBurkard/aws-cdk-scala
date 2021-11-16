package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataset {

  def apply(
    internalResourceId: String,
    actions: List[_],
    datasetName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriod: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty] = None,
    versioningConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty] = None,
    contentDeliveryRules: Option[List[_]] = None,
    triggers: Option[List[_]] = None,
    lateDataRules: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotanalytics.CfnDataset =
    software.amazon.awscdk.services.iotanalytics.CfnDataset.Builder
      .create(stackCtx, internalResourceId)
      .actions(actions.asJava)
      .datasetName(datasetName)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriod(retentionPeriod.orNull)
      .versioningConfiguration(versioningConfiguration.orNull)
      .contentDeliveryRules(contentDeliveryRules.map(_.asJava).orNull)
      .triggers(triggers.map(_.asJava).orNull)
      .lateDataRules(lateDataRules.map(_.asJava).orNull)
      .build()
}

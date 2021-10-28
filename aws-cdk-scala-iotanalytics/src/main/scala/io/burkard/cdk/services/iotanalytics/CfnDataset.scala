package io.burkard.cdk.services.iotanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDataset {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriod: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty] = None,
    actions: Option[List[_]] = None,
    datasetName: Option[String] = None,
    versioningConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty] = None,
    contentDeliveryRules: Option[List[_]] = None,
    triggers: Option[List[_]] = None,
    lateDataRules: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotanalytics.CfnDataset =
    software.amazon.awscdk.services.iotanalytics.CfnDataset.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriod(retentionPeriod.orNull)
      .actions(actions.map(_.asJava).orNull)
      .datasetName(datasetName.orNull)
      .versioningConfiguration(versioningConfiguration.orNull)
      .contentDeliveryRules(contentDeliveryRules.map(_.asJava).orNull)
      .triggers(triggers.map(_.asJava).orNull)
      .lateDataRules(lateDataRules.map(_.asJava).orNull)
      .build()
}

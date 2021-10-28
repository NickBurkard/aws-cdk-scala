package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFeatureGroupProps {

  def apply(
    offlineStoreConfig: Option[AnyRef] = None,
    eventTimeFeatureName: Option[String] = None,
    featureDefinitions: Option[List[_]] = None,
    roleArn: Option[String] = None,
    onlineStoreConfig: Option[AnyRef] = None,
    recordIdentifierFeatureName: Option[String] = None,
    featureGroupName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps =
    (new software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps.Builder)
      .offlineStoreConfig(offlineStoreConfig.orNull)
      .eventTimeFeatureName(eventTimeFeatureName.orNull)
      .featureDefinitions(featureDefinitions.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .onlineStoreConfig(onlineStoreConfig.orNull)
      .recordIdentifierFeatureName(recordIdentifierFeatureName.orNull)
      .featureGroupName(featureGroupName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}

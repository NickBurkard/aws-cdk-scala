package io.burkard.cdk.services.s3objectlambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ObjectLambdaConfigurationProperty {

  def apply(
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    supportingAccessPoint: Option[String] = None,
    allowedFeatures: Option[List[String]] = None,
    transformationConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .supportingAccessPoint(supportingAccessPoint.orNull)
      .allowedFeatures(allowedFeatures.map(_.asJava).orNull)
      .transformationConfigurations(transformationConfigurations.map(_.asJava).orNull)
      .build()
}

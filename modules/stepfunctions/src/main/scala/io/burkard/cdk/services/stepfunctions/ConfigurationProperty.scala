package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationProperty {

  def apply(
    properties: Option[Map[String, String]] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty]] = None,
    classification: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.Builder)
      .properties(properties.map(_.asJava).orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .classification(classification.orNull)
      .build()
}
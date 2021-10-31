package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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

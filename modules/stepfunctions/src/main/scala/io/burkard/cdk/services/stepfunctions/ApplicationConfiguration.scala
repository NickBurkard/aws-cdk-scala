package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationConfiguration {

  def apply(
    classification: software.amazon.awscdk.services.stepfunctions.tasks.Classification,
    nestedConfig: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration]] = None,
    properties: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.Builder)
      .classification(classification)
      .nestedConfig(nestedConfig.map(_.asJava).orNull)
      .properties(properties.map(_.asJava).orNull)
      .build()
}

package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlgorithmSpecification {

  def apply(
    trainingInputMode: Option[software.amazon.awscdk.services.stepfunctions.tasks.InputMode] = None,
    algorithmName: Option[String] = None,
    trainingImage: Option[software.amazon.awscdk.services.stepfunctions.tasks.DockerImage] = None,
    metricDefinitions: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification =
    (new software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification.Builder)
      .trainingInputMode(trainingInputMode.orNull)
      .algorithmName(algorithmName.orNull)
      .trainingImage(trainingImage.orNull)
      .metricDefinitions(metricDefinitions.map(_.asJava).orNull)
      .build()
}

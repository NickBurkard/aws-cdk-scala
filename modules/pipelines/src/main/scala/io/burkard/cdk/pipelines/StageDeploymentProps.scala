package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StageDeploymentProps {

  def apply(
    pre: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    post: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    stackSteps: Option[List[_ <: software.amazon.awscdk.pipelines.StackSteps]] = None,
    stageName: Option[String] = None
  ): software.amazon.awscdk.pipelines.StageDeploymentProps =
    (new software.amazon.awscdk.pipelines.StageDeploymentProps.Builder)
      .pre(pre.map(_.asJava).orNull)
      .post(post.map(_.asJava).orNull)
      .stackSteps(stackSteps.map(_.asJava).orNull)
      .stageName(stageName.orNull)
      .build()
}

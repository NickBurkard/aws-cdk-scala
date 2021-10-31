package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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

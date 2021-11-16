package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackSteps {

  def apply(
    stack: software.amazon.awscdk.Stack,
    pre: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    post: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    changeSet: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None
  ): software.amazon.awscdk.pipelines.StackSteps =
    (new software.amazon.awscdk.pipelines.StackSteps.Builder)
      .stack(stack)
      .pre(pre.map(_.asJava).orNull)
      .post(post.map(_.asJava).orNull)
      .changeSet(changeSet.map(_.asJava).orNull)
      .build()
}

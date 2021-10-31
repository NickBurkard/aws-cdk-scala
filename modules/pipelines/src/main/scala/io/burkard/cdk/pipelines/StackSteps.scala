package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackSteps {

  def apply(
    pre: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    post: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    changeSet: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    stack: Option[software.amazon.awscdk.Stack] = None
  ): software.amazon.awscdk.pipelines.StackSteps =
    (new software.amazon.awscdk.pipelines.StackSteps.Builder)
      .pre(pre.map(_.asJava).orNull)
      .post(post.map(_.asJava).orNull)
      .changeSet(changeSet.map(_.asJava).orNull)
      .stack(stack.orNull)
      .build()
}

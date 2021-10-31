package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WaveOptions {

  def apply(
    pre: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    post: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None
  ): software.amazon.awscdk.pipelines.WaveOptions =
    (new software.amazon.awscdk.pipelines.WaveOptions.Builder)
      .pre(pre.map(_.asJava).orNull)
      .post(post.map(_.asJava).orNull)
      .build()
}

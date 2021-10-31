package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Wave {

  def apply(
    id: String,
    pre: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    post: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None
  ): software.amazon.awscdk.pipelines.Wave =
    software.amazon.awscdk.pipelines.Wave.Builder
      .create(id)
      .pre(pre.map(_.asJava).orNull)
      .post(post.map(_.asJava).orNull)
      .build()
}

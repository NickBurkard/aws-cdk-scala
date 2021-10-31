package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Selector {

  def apply(
    labels: Option[Map[String, String]] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.Selector =
    (new software.amazon.awscdk.services.eks.Selector.Builder)
      .labels(labels.map(_.asJava).orNull)
      .namespace(namespace.orNull)
      .build()
}

package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SelectorProperty {

  def apply(
    labels: Option[List[_]] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty =
    (new software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty.Builder)
      .labels(labels.map(_.asJava).orNull)
      .namespace(namespace.orNull)
      .build()
}

package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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

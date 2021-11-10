package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterLoggingProperty {

  def apply(
    enabledTypes: Option[List[_]] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty.Builder)
      .enabledTypes(enabledTypes.map(_.asJava).orNull)
      .build()
}

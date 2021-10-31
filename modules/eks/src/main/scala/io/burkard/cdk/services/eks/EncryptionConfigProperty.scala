package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionConfigProperty {

  def apply(
    provider: Option[software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty] = None,
    resources: Option[List[String]] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty.Builder)
      .provider(provider.orNull)
      .resources(resources.map(_.asJava).orNull)
      .build()
}

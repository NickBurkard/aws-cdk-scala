package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProxyConfigurationProperty {

  def apply(
    containerName: Option[String] = None,
    proxyConfigurationProperties: Option[List[_]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.Builder)
      .containerName(containerName.orNull)
      .proxyConfigurationProperties(proxyConfigurationProperties.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}

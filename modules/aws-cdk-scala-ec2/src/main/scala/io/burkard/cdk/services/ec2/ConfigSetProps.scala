package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigSetProps {

  def apply(
    configs: Option[Map[String, _ <: software.amazon.awscdk.services.ec2.InitConfig]] = None,
    configSets: Option[Map[String, _ <: List[String]]] = None
  ): software.amazon.awscdk.services.ec2.ConfigSetProps =
    (new software.amazon.awscdk.services.ec2.ConfigSetProps.Builder)
      .configs(configs.map(_.asJava).orNull)
      .configSets(configSets.map(_.view.mapValues(_.asJava).toMap.asJava).orNull)
      .build()
}

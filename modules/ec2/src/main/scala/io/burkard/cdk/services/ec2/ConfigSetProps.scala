package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigSetProps {

  def apply(
    configs: Option[Map[String, _ <: software.amazon.awscdk.services.ec2.InitConfig]] = None,
    configSets: Option[Map[String, _ <: List[String]]] = None
  ): software.amazon.awscdk.services.ec2.ConfigSetProps =
    (new software.amazon.awscdk.services.ec2.ConfigSetProps.Builder)
      .configs(configs.map(_.asJava).orNull)
      .configSets(configSets.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .build()
}

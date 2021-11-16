package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigSetProps {

  def apply(
    configs: Map[String, _ <: software.amazon.awscdk.services.ec2.InitConfig],
    configSets: Map[String, _ <: List[String]]
  ): software.amazon.awscdk.services.ec2.ConfigSetProps =
    (new software.amazon.awscdk.services.ec2.ConfigSetProps.Builder)
      .configs(configs.asJava)
      .configSets(configSets.mapValues(_.asJava).toMap.asJava)
      .build()
}

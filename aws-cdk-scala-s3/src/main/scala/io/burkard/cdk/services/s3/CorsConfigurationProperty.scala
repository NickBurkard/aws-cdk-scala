package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CorsConfigurationProperty {

  def apply(
    corsRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder)
      .corsRules(corsRules.map(_.asJava).orNull)
      .build()
}

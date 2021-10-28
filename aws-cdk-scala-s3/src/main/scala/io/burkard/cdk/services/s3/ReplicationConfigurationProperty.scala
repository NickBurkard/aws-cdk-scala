package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationConfigurationProperty {

  def apply(
    role: Option[String] = None,
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder)
      .role(role.orNull)
      .rules(rules.map(_.asJava).orNull)
      .build()
}

package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
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

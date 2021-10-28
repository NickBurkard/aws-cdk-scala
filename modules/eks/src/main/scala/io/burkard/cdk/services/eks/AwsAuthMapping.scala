package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsAuthMapping {

  def apply(
    username: Option[String] = None,
    groups: Option[List[String]] = None
  ): software.amazon.awscdk.services.eks.AwsAuthMapping =
    (new software.amazon.awscdk.services.eks.AwsAuthMapping.Builder)
      .username(username.orNull)
      .groups(groups.map(_.asJava).orNull)
      .build()
}

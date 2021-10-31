package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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

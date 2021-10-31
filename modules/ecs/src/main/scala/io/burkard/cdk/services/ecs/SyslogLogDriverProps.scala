package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SyslogLogDriverProps {

  def apply(
    format: Option[String] = None,
    tag: Option[String] = None,
    tlsCert: Option[String] = None,
    labels: Option[List[String]] = None,
    envRegex: Option[String] = None,
    address: Option[String] = None,
    tlsSkipVerify: Option[Boolean] = None,
    facility: Option[String] = None,
    env: Option[List[String]] = None,
    tlsCaCert: Option[String] = None,
    tlsKey: Option[String] = None
  ): software.amazon.awscdk.services.ecs.SyslogLogDriverProps =
    (new software.amazon.awscdk.services.ecs.SyslogLogDriverProps.Builder)
      .format(format.orNull)
      .tag(tag.orNull)
      .tlsCert(tlsCert.orNull)
      .labels(labels.map(_.asJava).orNull)
      .envRegex(envRegex.orNull)
      .address(address.orNull)
      .tlsSkipVerify(tlsSkipVerify.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .facility(facility.orNull)
      .env(env.map(_.asJava).orNull)
      .tlsCaCert(tlsCaCert.orNull)
      .tlsKey(tlsKey.orNull)
      .build()
}

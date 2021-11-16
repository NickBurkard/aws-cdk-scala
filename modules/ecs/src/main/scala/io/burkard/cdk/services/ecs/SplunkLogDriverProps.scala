package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SplunkLogDriverProps {

  def apply(
    url: String,
    format: Option[software.amazon.awscdk.services.ecs.SplunkLogFormat] = None,
    sourceType: Option[String] = None,
    tag: Option[String] = None,
    gzip: Option[Boolean] = None,
    labels: Option[List[String]] = None,
    token: Option[software.amazon.awscdk.SecretValue] = None,
    env: Option[List[String]] = None,
    index: Option[String] = None,
    source: Option[String] = None,
    insecureSkipVerify: Option[String] = None,
    gzipLevel: Option[Number] = None,
    caPath: Option[String] = None,
    verifyConnection: Option[Boolean] = None,
    secretToken: Option[software.amazon.awscdk.services.ecs.Secret] = None,
    caName: Option[String] = None,
    envRegex: Option[String] = None
  ): software.amazon.awscdk.services.ecs.SplunkLogDriverProps =
    (new software.amazon.awscdk.services.ecs.SplunkLogDriverProps.Builder)
      .url(url)
      .format(format.orNull)
      .sourceType(sourceType.orNull)
      .tag(tag.orNull)
      .gzip(gzip.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .labels(labels.map(_.asJava).orNull)
      .token(token.orNull)
      .env(env.map(_.asJava).orNull)
      .index(index.orNull)
      .source(source.orNull)
      .insecureSkipVerify(insecureSkipVerify.orNull)
      .gzipLevel(gzipLevel.orNull)
      .caPath(caPath.orNull)
      .verifyConnection(verifyConnection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .secretToken(secretToken.orNull)
      .caName(caName.orNull)
      .envRegex(envRegex.orNull)
      .build()
}

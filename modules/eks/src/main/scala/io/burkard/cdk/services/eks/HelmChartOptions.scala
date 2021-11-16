package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HelmChartOptions {

  def apply(
    chart: String,
    createNamespace: Option[Boolean] = None,
    repository: Option[String] = None,
    version: Option[String] = None,
    values: Option[Map[String, _]] = None,
    release: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.HelmChartOptions =
    (new software.amazon.awscdk.services.eks.HelmChartOptions.Builder)
      .chart(chart)
      .createNamespace(createNamespace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .repository(repository.orNull)
      .version(version.orNull)
      .values(values.map(_.asJava).orNull)
      .release(release.orNull)
      .timeout(timeout.orNull)
      .namespace(namespace.orNull)
      .build()
}

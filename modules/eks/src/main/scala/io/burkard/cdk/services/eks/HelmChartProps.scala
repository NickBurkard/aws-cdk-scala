package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HelmChartProps {

  def apply(
    cluster: software.amazon.awscdk.services.eks.ICluster,
    createNamespace: Option[Boolean] = None,
    repository: Option[String] = None,
    chart: Option[String] = None,
    values: Option[Map[String, _]] = None,
    release: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.eks.HelmChartProps =
    (new software.amazon.awscdk.services.eks.HelmChartProps.Builder)
      .cluster(cluster)
      .createNamespace(createNamespace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .repository(repository.orNull)
      .chart(chart.orNull)
      .values(values.map(_.asJava).orNull)
      .release(release.orNull)
      .timeout(timeout.orNull)
      .namespace(namespace.orNull)
      .version(version.orNull)
      .build()
}

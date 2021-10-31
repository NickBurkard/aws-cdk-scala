package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HelmChartProps {

  def apply(
    createNamespace: Option[Boolean] = None,
    repository: Option[String] = None,
    chart: Option[String] = None,
    values: Option[Map[String, _]] = None,
    release: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.eks.HelmChartProps =
    (new software.amazon.awscdk.services.eks.HelmChartProps.Builder)
      .createNamespace(createNamespace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .repository(repository.orNull)
      .chart(chart.orNull)
      .values(values.map(_.asJava).orNull)
      .release(release.orNull)
      .timeout(timeout.orNull)
      .namespace(namespace.orNull)
      .cluster(cluster.orNull)
      .version(version.orNull)
      .build()
}

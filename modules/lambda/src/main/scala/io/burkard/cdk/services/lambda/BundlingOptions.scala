package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BundlingOptions {

  def apply(
    buildArgs: Option[Map[String, String]] = None,
    externalModules: Option[List[String]] = None,
    banner: Option[String] = None,
    dockerImage: Option[software.amazon.awscdk.DockerImage] = None,
    nodeModules: Option[List[String]] = None,
    environment: Option[Map[String, String]] = None,
    sourceMap: Option[Boolean] = None,
    metafile: Option[Boolean] = None,
    commandHooks: Option[software.amazon.awscdk.services.lambda.nodejs.ICommandHooks] = None,
    sourcesContent: Option[Boolean] = None,
    keepNames: Option[Boolean] = None,
    loader: Option[Map[String, String]] = None,
    assetHash: Option[String] = None,
    preCompilation: Option[Boolean] = None,
    sourceMapMode: Option[software.amazon.awscdk.services.lambda.nodejs.SourceMapMode] = None,
    minify: Option[Boolean] = None,
    forceDockerBundling: Option[Boolean] = None,
    charset: Option[software.amazon.awscdk.services.lambda.nodejs.Charset] = None,
    target: Option[String] = None,
    tsconfig: Option[String] = None,
    define: Option[Map[String, String]] = None,
    footer: Option[String] = None,
    logLevel: Option[software.amazon.awscdk.services.lambda.nodejs.LogLevel] = None,
    esbuildVersion: Option[String] = None
  ): software.amazon.awscdk.services.lambda.nodejs.BundlingOptions =
    (new software.amazon.awscdk.services.lambda.nodejs.BundlingOptions.Builder)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .externalModules(externalModules.map(_.asJava).orNull)
      .banner(banner.orNull)
      .dockerImage(dockerImage.orNull)
      .nodeModules(nodeModules.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .sourceMap(sourceMap.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .metafile(metafile.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .commandHooks(commandHooks.orNull)
      .sourcesContent(sourcesContent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keepNames(keepNames.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loader(loader.map(_.asJava).orNull)
      .assetHash(assetHash.orNull)
      .preCompilation(preCompilation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceMapMode(sourceMapMode.orNull)
      .minify(minify.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .forceDockerBundling(forceDockerBundling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .charset(charset.orNull)
      .target(target.orNull)
      .tsconfig(tsconfig.orNull)
      .define(define.map(_.asJava).orNull)
      .footer(footer.orNull)
      .logLevel(logLevel.orNull)
      .esbuildVersion(esbuildVersion.orNull)
      .build()
}

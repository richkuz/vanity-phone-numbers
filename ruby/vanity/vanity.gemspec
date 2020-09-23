require_relative 'lib/vanity/version'

Gem::Specification.new do |spec|
  spec.name          = "vanity"
  spec.version       = Vanity::VERSION
  spec.authors       = ["Rich Kuzsma"]
  spec.email         = ["62522248+richkuz@users.noreply.github.com"]

  spec.summary       = %q{Vanity Phone Numbers Code Example}
  spec.homepage      = "http://example.com"
  spec.required_ruby_version = Gem::Requirement.new(">= 2.3.0")

  spec.metadata["allowed_push_host"] = "http://example.com"

  spec.metadata["homepage_uri"] = spec.homepage
  spec.metadata["source_code_uri"] = "http://example.com"
  spec.metadata["changelog_uri"] = "http://example.com"

  # Specify which files should be added to the gem when it is released.
  # The `git ls-files -z` loads the files in the RubyGem that have been added into git.
  spec.files         = Dir.chdir(File.expand_path('..', __FILE__)) do
    `git ls-files -z`.split("\x0").reject { |f| f.match(%r{^(test|spec|features)/}) }
  end
  spec.bindir        = "exe"
  spec.executables   = spec.files.grep(%r{^exe/}) { |f| File.basename(f) }
  spec.require_paths = ["lib"]

  spec.add_development_dependency 'rspec'
  spec.add_development_dependency 'rake'
end
